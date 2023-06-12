import cv2
img = cv2.imread("john doe.jpg", cv2.IMREAD_GRAYSCALE)
cv2.imshow("image", img)
cv2.waitKey(0)
cv2.destroyAllWindows()



//note
will convert image from color to grayscale