import numpy as np
import cv2
import matplotlib.pyplot as plt 

img = cv2.imread('3.jpeg', 0)
plt.imshow(img, cmap='gray', interpolation='bicubic')
plt.xtics([]), plt.yticks([])
plt.show()