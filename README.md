# Weather Station

This project implements a weather monitoring application based on the Observer design pattern. 
A central WeatherDataobject collects real-time measurements (temperature, humidity, and pressure) and automatically pushes updates to any number of registered display elements.

### PressureDisplay 
This class was added to show the raw atmospheric pressure value on its own, separate from the forecast logic. It follows the exact same pattern as every other display:

### HeatIndexDisplay 
HeatIndexDisplay was added to compute and show the Heat Index (HI), a derived value calculated from temperature and humidity using this formula and all the values:
<img width="1127" height="396" alt="image" src="https://github.com/user-attachments/assets/6007c8e2-d08f-4b9b-89a6-abde14e1a7fa" />
T is dry-bulb temperature (°C) and R is relative humidity (%).

This display follows the same registration pattern as the others, with one addition: instead of just storing the raw values it receives, 
update(...) first passes temperature and humidity into a helper method, computeHeatIndex(t, rh), which applies the formula above and returns the calculated index. 
That result is stored and then shown with Display().
