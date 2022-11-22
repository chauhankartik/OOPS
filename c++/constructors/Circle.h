/*
*  inclusion-guard
*/
#ifndef CIRCLE_H
#define CIRCLE_H

class Circle
{
public:
	Circle();
	Circle(double);
	double getArea() const;
	double getRadius() const;
private:
	double radius;
};

#endif