package com.mischief247.interfaces;

import com.mischief247.utils.Type;

public interface IItem {
String getName();
boolean isEnchanted();
String getDescription();
Type getType();
int getWeight();
int hashcode();
}
