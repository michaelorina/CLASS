import numpy as np
import matplotlib.pyplot as plt
x = np.array([ [0,255,0,255],[255,0,255,0],[0,0,0,255],[255,0,255,0] ])
plt.imshow(x,cmap='gray')
plt.show()



//NOTE
the above script will show the image pixels
x = np.array([ [0,255,0,255],[255,0,255,0],[0,255,0,255],[255,0,255,0] ])
this will display second last row second column as white
the first script will display as black