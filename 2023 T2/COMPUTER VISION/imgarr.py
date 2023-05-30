import cv2
import numpy as np
img = cv2.imread("Nadia_Murad.jpg", cv2.IMREAD_COLOR)

x=np.array(img)

print(x)
#cv2.imshow("image", img)
#cv2.waitKey(0)
#cv2.destroyAllWindows()