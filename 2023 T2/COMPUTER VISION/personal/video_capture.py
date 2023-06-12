import cv2

cap = cv2.videoCapture(0)

while True:

    ret, frame = cap.read()

    cv2.imshow