import numpy as np 
import cv2

img = cv2.imread('3.jpeg')

cv2.imshow('window', img)
cv2.waitKey(0)
cv2.destroyAllWindows()