import cv2
import numpy as np

img = cv2.imread('3.jpeg')
face_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcasade_frontalface_default.xml')
face = face_cascade.detectMultiScale(img, 1.1, 4)

for x,y,w,h in faces:

    cv2.rectangle(img, (x,y), (x+w, y+h), (0,0,255), 2)
    cv2.imshow('Window', img)

    k = cv2.waitKey(0) & 0xff
    if k == 27:
        break

cv2.imshow('Window', img)
cv2.waitKey()
cv2.destroyAllWindows()