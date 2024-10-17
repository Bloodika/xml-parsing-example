import xml.etree.ElementTree as ET
tree = ET.parse('Example.xml')
root = tree.getroot()
books = root.findall("book/author")
for book in books:
    print(book.text)