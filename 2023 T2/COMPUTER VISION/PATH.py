import cv2
path = r'C:\Users\Username\Pictures\Saved Pictures\Nadia_Murad.jpg'
img = cv2.imread(path, cv2.IMREAD_GRAYSCALE)
cv2.imshow("image", img)
cv2.waitKey(0)
cv2.destroyAllWindows()



# //note
# will show image in different directory/folder from the one you are in