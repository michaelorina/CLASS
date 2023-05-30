import cv2 as cv
import numpy as np

# img = cv.imread("nadia.jpg")
face_cascade = cv.CascadeClassifier(cv.data.haarcascades + 'haarcascade_frontalface_default.xml')
cap = cv.VideoCapture(0)
eye_cascade = cv.CascadeClassifier(cv.data.haarcascades + 'haarcascade_eye.xml')
# gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)
# faces = face_cascade.detectMultiScale(gray, 1.1, 5)
# number_of_faces = len(faces)
# print(number_of_faces)
# print(faces)
while True:
#Read Frame
	ret, img = cap.read()
	gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)
	faces = face_cascade.detectMultiScale(gray, 1.1, 5)

	for x,y,w,h in faces:
		cv.rectangle(img,(x,y),(x+w, y+h),(0,0,255),2)
		# cv.imshow('img',img)
		roi_gray = gray[y:y+h, x:x+w]
		roi_color = img[y:y+h, x:x+w]
		eyes = eye_cascade.detectMultiScale(roi_gray)
		for ex,ey,ew,eh in eyes:
			cv.rectangle(roi_color,(ex,ey),(ex+ew, ey+eh),(0,255,0),2)
	
		k = cv.waitKey(10) & 0xff
		if k ==27:
		 break

cap.release()
cv2.destroyAllWindows()

