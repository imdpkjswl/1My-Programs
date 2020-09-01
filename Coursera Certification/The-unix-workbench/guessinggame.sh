#!/usr/bin/env bash

function play_game {
	
	answer=$(ls -l | wc -l)
	let answer=$answer-1
	
	correct=0

	while [[ $correct -eq 0 ]]
	do
		echo "How many files are in this directory?"
        	read response
	        echo "You entered: $response"

		if [[ $response -eq $answer ]]
		then
			echo "You are correct! Congratulations"
			correct=1
		elif [[ $response -lt $answer ]]
		then
			echo "That is too low, try again."
		else
			echo "That is too high, try again."
		fi
	done
}

echo "Start of the guessing game"
play_game
echo "End of program"

