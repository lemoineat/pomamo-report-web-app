// Copyright (C) 2009-2023 Lemoine Automation Technologies
//
// SPDX-License-Identifier: EPL-2.0

package com.lemoinetechnologies.pulse.reporting.domain;

public class Triplet<T, U, V>
{
    T _first;
    public T first() { return _first; }

    U _second;
    public U second() { return _second; }

    V _third;
    public V third() { return _third; }

    public Triplet(T first, U second, V third)
    {
        _first = first;
        _second = second;
        _third = third;
    }
}