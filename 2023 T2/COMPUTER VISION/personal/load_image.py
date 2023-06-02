import numpy as np
import cv2

img = cv2.imread('3.jpeg',0)
cv2.imshow('Window', img)

k = cv2.waitKey(0)

if k == 27:
    cv2.destroyAllWindows()
elif k == ord('s'):
    cv2.imwrite('3.png', img)
    cv2.destroyAllWindows()