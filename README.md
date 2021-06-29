Shield: [![CC BY 4.0][cc-by-shield]][cc-by]

This work is licensed under a
[Creative Commons Attribution 4.0 International License][cc-by].

[![CC BY 4.0][cc-by-image]][cc-by]

[cc-by]: http://creativecommons.org/licenses/by/4.0/
[cc-by-image]: https://i.creativecommons.org/l/by/4.0/88x31.png
[cc-by-shield]: https://img.shields.io/badge/License-CC%20BY%204.0-lightgrey.svg

# Annotated Portuguese Criminal-Related Corpus

NOTICE: 

Documents were retrieved from the following repositories:
- Criminal Investigation Reports: these reports synthesize in one or multiple documents the information collected during a criminal investigation, namely witnesses, suspects,   police investigators, or fact descriptions. The documents are about cases in which there have been a final decision and are no longer subject to appeal;
- Criminal News: documents published in online newspapers, usually written by investigative journalists.
- PGdLisboa: another source for criminal reports is the Procuradoria-Geral Distrital de Lisboa (https://www.pgdlisboa.pt/) website. The news are about cases in which there have been a final decision and are no longer subject to appeal.  

Please DO NOT modify this file directly. (this repo will be updated continuously, maintaining a file named as change_tracker)

The annotated corpus aims to contribute for Machine Learning and Natural Language Processing tasks. 

# Authors

Gonçalo Carnaz obtained a PhD in Computer Science from the University of Évora. His main research interests are graph databases, natural language processing, information extraction and machine learning.

Vitor Beires Nogueira, Assistant Professor in the Department of Computer Science at the University of Évora, obtained a PhD in Computer Sciences from the University of Évora in 2009. His research interests include declarative approaches to knowledge representation and computational reasoning, natural language processing and IoT. He is a researcher of NOVA LINCS.

Mário Antunes, Professor at Computers Engineering Dept., School of Technology and Management, Polytechnic of Leiria, where coordinates a MSc program in Cybersecurity and Digital Forensics. Holds a PhD in  Computer Science, by the University of Porto obtained in 2011. He is a senior research at INESC-TEC. His main research interests are cybersecurity, information security, networks and systems administration, and machine learning.

# Publications

Carnaz G, Antunes M, Nogueira VB. An Annotated Corpus of Crime-Related Portuguese Documents for NLP and Machine Learning Processing. Data. 2021; 6(7):71. (URL: https://www.mdpi.com/2306-5729/6/7/71)

Carnaz G, Nogueira VB, Antunes M. A Graph Database Representation of Portuguese Criminal-Related Documents. Informatics. 2021; 8(2):37 (URL: https://www.mdpi.com/1137858)

Gonçalo Carnaz, Vitor Nogueira, Mário Antunes; "Knowledge Representation of Crime-Related Events: a Preliminary Approach"; 8th Symposium on Languages, Applications and Technologies (SLATE'19); ISBN: 978-3-95977-114-6; vol.74; pp. 13:1-13:8; June 2019; Coimbra, Portugal (URL: https://drops.dagstuhl.de/opus/volltexte/2019/10880/pdf/OASIcs-SLATE-2019-13.pdf)

Gonçalo Carnaz, Vitor Nogueira, Paulo Quaresma, Mário Antunes, Nuno Ferreira; "A Review on Relations Extraction in Police Reports"; 7th World Conference on Information Systems and Technologies (WCIST'19); vol.930; pp.494-503; April 2019; La Toja, Spain (URL: https://link.springer.com/chapter/10.1007/978-3-030-16181-1_47)

Gonçalo Carnaz, Vitor Nogueira, Mário Antunes, Nuno Ferreira; "An automated system for criminal police reports analysis"; 14th International Conference on Information Assurance and Security (IAS'18); ISBN: 978-3-030-17064-6; pp.360-369; December 2018; Editor: Springer; Porto, Portugal (URL:https://link.springer.com/chapter/10.1007/978-3-030-17065-3_36)




# Dataset layout

	/Dataset 
		/Data collection
		- Folder: CrimeNews - dataset built after a collection in online newspapers related to crime.
		- Folder: PGrLisboa - dataset built after a collection in Procudoria Geral da Republica de Lisboa (Open Source News) related to crime.
		- Folder: Criminal Investigation Reports - The data retrieved from the criminal Investigation Reports, namely names, locations and dates, was anonimyzed..
					
		/NER
		- Folder: Common -   The training and testing dataset for NER Classifiers (Named-Entities: Person, Location, Organization, Date and Numeric);
	  	 			         The NER Classifiers using Three Different Machine Learning Approaches (Naive Bayes, Perceptron, and MaxEnt). 	
		- Folder: Narcotis - The training and testing dataset for NER Classifier (Named-Entities: Narcotics), and the NER Classifier.
