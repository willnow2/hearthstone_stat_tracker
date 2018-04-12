# hearthstone_stat_tracker
This program is used to help with tracking of stats for the game Hearthstone.
When a game starts, select the class you and your opponent are playing as.
Checkmark the box 'Got Coin?' if you go second (ie. start with the coin), deselect the box if you go first and thus, don't have the coin.
At the end of the game, click either the 'Victory' or the 'Defeat' button to track the result.
As soon as either button is clicked, the result will be automatically saved in a CSV file. The name of the csv file will be the current day's date following the format MMddEEE.csv
As more and more results are saved, the contents and size of any given csv file will grow, depending on how many games are tracked on a given day.

IMPORTANT
Results are automatically saved in a .csv file in a folder titled hs_results on the Desktop. The user must create the hs_results directory themselves and it must be located on the desktop. This program will not create the directory for you and data will be lost if the directory does not exist beforehand.
