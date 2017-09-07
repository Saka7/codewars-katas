from math import sqrt, pow

def length(a, b):
    return sqrt(pow(b.x - a.x, 2) + pow(b.y - a.y, 2))

def triangle_area(t):
    a, b, c = (length(t.a, t.b), length(t.b, t.c), length(t.c, t.a))
    s = (a + b + c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))