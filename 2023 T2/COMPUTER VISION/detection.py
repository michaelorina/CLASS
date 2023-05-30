import cv2 as cv
import numpy as np

img = cv.imread("Nadia_Murad.jpg")
face_cascade = cv.CascadeClassifier(cv.data.haarcascades +'haarcascade_frontalface_default.xml')
faces = face_cascade.detectMultiScale(img, 1.1, 4)



for x,y,w,h in faces:
    
    cv.rectangle(img, (x, y), (x+w, y+h), (0, 0, 255), 2)
    
    cv.imshow('img', img)
    
    k = cv.waitKey(0) & 0xff
    if k==27:
        break
        
cv.imshow('img', img)
cv.waitKey()
cv.destroyAllWindows()