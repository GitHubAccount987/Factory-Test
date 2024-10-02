package com.company.Attributes;

// Since names must begin with a letter each EngineType is prefixed with the word "Engine"
// The underscore in an engine type represents a comma e.g. Engine_1_4L → engine type of 1,4 Liters
// Engine_2L → engine type of 2,0 Liters
// The Electric engine type is an exception it doesn't need to be prefixed with the word Engine since it begins
// with a letter. However, to ensure better code readability it's also prefixed.

public enum EngineType {
    Engine_1L, Engine_1_4L, Engine_1_6L, Engine_2L, Engine_Electric
}
