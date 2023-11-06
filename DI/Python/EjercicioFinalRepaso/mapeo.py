import matplotlib.pyplot as plt
import numpy as np
import time
import random

temas=['Greys', 'Purples', 'Blues', 'Greens', 'Oranges', 'Reds', 'YlOrBr', 'YlOrRd', 'OrRd', 'PuRd', 'RdPu', 'BuPu','GnBu', 'PuBu', 'YlGnBu', 'PuBuGn', 'BuGn', 'YlGn']

tiempo=int(input("Introduce cada cuanto tiempo quieres que cambie:"))

while True:
    plt.figure(1)
    plt.pcolormesh(np.random.rand(40,40),cmap=random.choice(temas))
    plt.show(block = False)
    plt.pause(tiempo)
    
