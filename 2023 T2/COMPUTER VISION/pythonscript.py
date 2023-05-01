import cv2
img = cv2.imread("john doe.jpg", cv2.IMREAD_COLOR)
cv2.imshow("image", img)
cv2.waitKey(0)
cv2.destroyAllWindows()



//comment
//not part of code
"image" is the name of window

//change directory
C:\Users\Username>cd C:\Users\munya\AppData\Local\Programs\Python\Python311
//run the script
C:\Users\Username\AppData\Local\Programs\Python\Python311>python pythonscript.py

//What I learned today - 27th April
matplot uses bgr color format
opencv usec rgb color format
wait key reads in milliseconds (1 minute=60 seconds = 60,000 milliseconds)