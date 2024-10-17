const {XMLParser, XMLBuilder} = require("fast-xml-parser");
const fs = require('node:fs');

const fileContent = fs.readFileSync('Example.xml', 'utf8');
const parser = new XMLParser();
const jObj = parser.parse(fileContent);

console.log(jObj.catalog.book)