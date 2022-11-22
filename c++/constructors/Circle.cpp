#include "Circle.h"

Circle::Circle() {
	this->radius = 1;
}

double Circle::getArea() {
	return this->radius * this->radius * 3.14;
}

double Circle::getRadius() {
	return this->radius;
}