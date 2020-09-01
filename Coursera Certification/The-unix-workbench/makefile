all: README.md

README.md: guessinggame.sh
	touch README.md
	echo "# The Unix Workbench Assignment by Cheryl" > README.md
	echo -e "\nThe current date and time of this run: $$(date)" >> README.md
	echo -e "\nGuessinggame.sh contains the following number of lines:" >> README.md
	wc -l guessinggame.sh | egrep -o "[0-9]+" >> README.md

clean:
	rm README.md
