all: build run

build:
	javac -d bin aulas/*.java
	javac -d bin libs/*.java
	javac -d bin Main.java	
	javac -d bin trabalhos/*.java

run:
	java -cp bin Main

clear:
	rm bin/*



git:
	git config --global user.email "brunocaetano403@gmail.com"
	git config --global user.name "Bruno Caetano"