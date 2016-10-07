%% ENGI 1331
% Krishna Kota
% Date: 9/3/16
%% MA1
% Zhehao Su
% UH ID: 1485041

%% Problem 1
clc
clear

% Input the value
a = input('Enter the speed as a Mach number: ');

% Set constant for speed of sound
b = 343;%m/s

% Calculation
c = a*b;%m/s

% Conversion
c_mph = c*(0.621/1000)/(1/3600);%mph

% Output
fprintf('The speed of the plane is %0.0f mph.',c_mph);

%% Problem 2
clc
clear

% Input the mass of ethanol
e = input('Enter mass of ethanol [grams]: ');

% Set constants for density of ethanol and fuel efficiency
p = 789000;%g/m^3
f = 10705;%mpg

% Calcuate the volume
v = e/p;%m^3

% Conversion 
v_g = 264.172*v;%gallon

% Calculate the distance
d_mi = v_g*f;%mile

% Conversion
d = d_mi/0.621;%km

% Output
fprintf('The distance the Microjoule traveled is %0.1f kilometers.',d);

%% Prblem 3
clc
clear

% Allow user to define the height
H = input('Define the height of the tank [ft] ');%ft

% Define variables, move units to comment
P_s = 3;%atm
P_t = 5;%atm
g = 9.8;%m/s^2

% Unify P_s, 1 [atm] = 101325 [Pa]
P_s = P_s*101325;%Pa
P_t = P_t*101325;%Pa

% Conversion, 1 [m] = 3.28 [ft]
H = H/3.28;%m

% Calculate the rho
rho = (P_t - P_s)/(H*g);%kg/m^3

%?Output
fprintf('The density of tribromethylene is %0.2f [kg/m^3].',rho);

