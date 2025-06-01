/*
 * Copyright (c) 2013, 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package demo.parallel;

public class Complex {
    private final double re;   // действительная часть
    private final double im;   // мнимая часть

    public Complex(double real, double imag) {
        this.re = real;
        this.im = imag;
    }

    public Complex plus(Complex b) {
        return new Complex(this.re + b.re, this.im + b.im);
    }

    public Complex minus(Complex b) {
        return new Complex(this.re - b.re, this.im - b.im);
    }

    public Complex times(Complex b) {
        double real = this.re * b.re - this.im * b.im;
        double imag = this.re * b.im + this.im * b.re;
        return new Complex(real, imag);
    }

    public Complex square() {
        return this.times(this);
    }

    public Complex conjugate() {
        return new Complex(this.re, -this.im);
    }

    public Complex divide(Complex other) {
        double denominator = other.re * other.re + other.im * other.im;
        double newRe = (this.re * other.re + this.im * other.im) / denominator;
        double newIm = (this.im * other.re - this.re * other.im) / denominator;
        return new Complex(newRe, newIm);
    }

    public double lengthSQ() {
        return re * re + im * im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void sin() {
        // можно реализовать позже, если нужно
    }
}
