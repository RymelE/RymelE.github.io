from flask import Flask, render_template, request
import requests
from bs4 import BeautifulSoup
from urllib.parse import urljoin, urlparse
import time
import os

app = Flask(__name__)

# Function to fetch and parse a webpage
def fetch_page(url):
    try:
        response = requests.get(url)
        response.raise_for_status()
        return response.text
    except requests.exceptions.RequestException as e:
        return f"Error fetching {url}: {e}"

# Function to extract all internal links from a page
def extract_internal_links(url, html_content):
    soup = BeautifulSoup(html_content, 'html.parser')
    links = soup.find_all('a', href=True)
    internal_links = []
    
    for link in links:
        href = link['href']
        full_url = urljoin(url, href)
        if urlparse(full_url).netloc == urlparse(url).netloc:
            internal_links.append(full_url)
    return internal_links

# Function to scrape data from a given URL
def scrape_data_from_url(url):
    html_content = fetch_page(url)
    if html_content:
        soup = BeautifulSoup(html_content, 'html.parser')
        headers = [header.get_text(strip=True) for header in soup.find_all(['h1', 'h2', 'h3'])]
        return headers
    return []

# Function to save headers to a text file
def save_headers_to_file(headers):
    try:
        with open('scraped_headers.txt', 'a', encoding='utf-8') as file:
            file.write("\n".join(headers) + "\n\n")
        return True
    except Exception as e:
        return f"Error saving headers to file: {e}"

# Route to display the form
@app.route('/')
def index():
    return render_template('index.html')

# Route to handle the form submission and start scraping
@app.route('/scrape', methods=['POST'])
def scrape():
    url = request.form['url']
    
    # Print the received URL to verify the form submission
    print(f"Received URL: {url}")
    
    # Now process the scraping (you can keep your scraping code as is)
    headers = scrape_data_from_url(url)
    
    if headers:
        print(f"Scraped headers: {headers}")  # Debugging output
        save_status = save_headers_to_file(headers)
        
        if save_status is True:
            message = f"Scraped headers from {url} and saved to file successfully!"
        else:
            message = f"Scraped headers from {url}, but there was an error saving to file: {save_status}"
    else:
        message = f"Failed to scrape {url}."
    
    return render_template('index.html', message=message)
if __name__ == '__main__':
    app.run(debug=True)
