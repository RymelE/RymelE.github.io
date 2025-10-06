<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Time Converter</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        label, select, input, button {
            margin: 10px 0;
        }
    </style>
</head>
<body>
    <h1>Time Converter to Zulu (UTC)</h1>
    <form id="timeConverterForm">
        <label for="timeZone">Select Time Zone:</label>
        <select id="timeZone" name="timeZone">
            <option value="EST">Eastern Time (EST)</option>
            <option value="CST">Central Time (CST)</option>
            <option value="MST">Mountain Time (MST)</option>
            <option value="PST">Pacific Time (PST)</option>
        </select>

        <label for="localTime">Enter Local Time (HH:MM):</label>
        <input type="text" id="localTime" name="localTime" placeholder="14:30" required>

        <button type="button" onclick="convertTime()">Convert to Zulu Time</button>
    </form>

    <p id="result"></p>

    <script>
        async function convertTime() {
            const timeZone = document.getElementById('timeZone').value;
            const localTime = document.getElementById('localTime').value;
            
            if (!localTime.match(/^\d{2}:\d{2}$/)) {
                alert('Please enter time in HH:MM format.');
                return;
            }
            
            const response = await fetch('/convert-time', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({ timeZone, localTime })
            });
            
            const data = await response.json();
            document.getElementById('result').innerText = `Zulu Time: ${data.zuluTime}`;
        }
    </script>
</body>
</html>
