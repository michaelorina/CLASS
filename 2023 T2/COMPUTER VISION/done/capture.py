import cv2
capture = cv2.VideoCapture(0)
while True:
	ret,image = capture.read()
	cv2.imshow('nicholas',image)
	key = cv2.waitKey(5000)
	if key == 27:
		cv2.imwrite('wes.jpg',image)
	break
capture.release()
cv2.destroyAllWindows()


# //key 27 is esc key