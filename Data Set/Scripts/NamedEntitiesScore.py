#
# Authors: Gonçalo Carnaz PhD, Vitor B. Nogueira PhD, Mário Antunes PhD
# Disclamer: This is part of Annotated-Corpus-of-Criminal-Related-Portuguese-Documents dataset 
#            
# Script Purpose: To count the number of annotated named-entities in criminal-related documents
# Reminder: -> this is a ongoing process of curation of files: with new NEs types; new annotations 
#           -> the file will be updated with the new NEs types 

import xml.dom.minidom
import xml.etree.ElementTree as ET
import os


FileNumber = 0
# Named-Entities
Numeric = 0
Person = 0
Location = 0
Time = 0
crimetype = 0
narcotics = 0
criminalrole = 0 
Organization = 0
licenseplates = 0
# In listdir (path to folders containing files) 
for annotatedfile in os.listdir(r'Path to Folder containing the Documents'):
    print('Counting NEs from document: %s' %annotatedfile) 
    FileNumber += 1
    # In parse (path to folders containing files) 
    tree = ET.parse(r"Path to Folder containing the Documents" + annotatedfile)
    root = tree.getroot()
    for elem in root:
        for subelem in elem:
            for s in subelem:
                    print('Found NE in document: %s' % s.tag)
                    if s.tag == 'Numeric': 
                        Numeric += 1
                    if s.tag == 'Person': 
                        Person += 1
                    if s.tag == 'Organization': 
                        Organization += 1  
                    if s.tag == 'Location': 
                        Location += 1    
                    if s.tag == 'Time': 
                        Time += 1   
                    if s.tag == 'crimetype': 
                        crimetype += 1   
                    if s.tag == 'narcotics': 
                        narcotics += 1   
                    if s.tag == 'criminalrole': 
                        criminalrole += 1  
                    if s.tag == 'Licenseplates': 
                        licenseplates += 1   

print('######## Named-Entities Annotated in %s files #########' % FileNumber)
print('Numeric: %s' % Numeric)
print('Person: %s' % Person)
print('Organization: %s' % Organization)
print('Location: %s' % Location)
print('Time: %s' % Time)
print('crimetype: %s' % crimetype)
print('narcotics: %s' % narcotics)
print('criminalrole: %s' % criminalrole)
print('licenseplates: %s' % licenseplates)
     