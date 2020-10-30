# STATS251F Notes

#### By Jiawei Wang

**[Unit2.pdf](https://github.com/Angold-4/UniversitySources/blob/master/2020Autumn/STATS251F/Lecture_Notes/Unit%202%20-%20Parameter%20Estimation.pdf)**

**<font color=red>For thouse people who cannot see fomular instead of these char below:</font><br>**
```
$$
f(x) = \frac 1{ \sqrt{2 \pi} \sigma} e^{- \frac 12 ({ \frac {x- \mu}{\sigma}})^2}
$$
```
**<font color=red>Please download this Chrome Extention: [MathJax Plugin for Github](https://chrome.google.com/webstore/detail/mathjax-plugin-for-github/ioemnmodlmafdkllaclgeombjnmnbima/related?utm_source=chrome-ntp-icon), and open this page again :-) thx!</font>**


<!-- vim-markdown-toc GFM -->

* [Unit 2 - Sampling Distribution of Means & Parameter Estimation](#unit-2---sampling-distribution-of-means--parameter-estimation)
    * [1.Random Variable](#1random-variable)
        * [Discrete Random Variable](#discrete-random-variable)
        * [Continuous Random Variable](#continuous-random-variable)
    * [2.Normal Distribution](#2normal-distribution)
        * [Standard Normal Distribution](#standard-normal-distribution)
        * [Normal Random Variable](#normal-random-variable)

<!-- vim-markdown-toc -->

## Unit 2 - Sampling Distribution of Means & Parameter Estimation


### 1.Random Variable
**<u>A random variable (r. v.) is a variable whose value is subject to variations due to chance or randomness.</u>**
* **A r.v. is written in capital letter: X, Y, Z, etc.**
* **The value of a r.v. is written in small letter: x, y, z, etc.**
* **Notice that the r.v's value is purely by chance; we do not know the outcome beforehand**

**There are 2 types of random variables, discrete and continuous.**

#### Discrete Random Variable
**<u>A discrete random variable, X , is one which may take on only a countable number of distinct values such as 0,1,2,3,4,....</u>**

**Examples<br>**
* **Number of children in a family**
* **Attendance at a cinema**
* **Number of patients in a doctor's surgery**
* **Number of defective light bulbs in a box**

**Let the discrete r.v. X takes on n discrete values: $ x_1, x_2, ⋯ , x_n. $ <br>The probability mass function (pmf (for discrete r.v.)) is given by**

$$
p(x) = 
    \begin{cases}
        P(X=x_i), & \text{i=1,2,...n;} \\
        0, & \text{otherwise;}\\
    \end{cases}
$$

**where $P(X = x_i)$ denotes the probability when the r.v. X takes on the i-th data value $x_i$.**

#### Continuous Random Variable
**<u>A continuous random variable , X , is one which takes an infinite number of possible values. Continuous random variables are usually measurements.</u>**

**Examples:**<br>
* **Height**
* **Weight**
* **Amount of sugar in an orange**
* **Time required to run a mile**

![continuous_r](sources/continuous_r.png)<br>

**Then f(x) is called the probability density function (pdf (for continuous r.v.)) of X**


### 2.Normal Distribution
**The most important distribution in the entire field of statistics is the normal distribution. Its graph, called the normal curve, is the bell-shaped curve shown below. Normal distribution can describe many phenomena in nature, business, finance, medicine, biology, etc.**

![normal_distribution](sources/normal_distribution.png)

* **Random variables occurring in practice often satisfy well a normal distribution.**
* **Large-sample statistics often turn out to be approximately normally distributed. This is a consequence of the central limit theorem.**
* **Most hypothesis testing that we're going to perform requires normality in some sense.**

**The probability density function of normal distribution is given by:**

$$
f(x) = \frac 1{ \sqrt{2 \pi} \sigma} e^{- \frac 12 ({ \frac {x- \mu}{\sigma}})^2}  
$$
$$
\text{where }\pi = 3.1416...  \text{   }e = 2.71828...
$$
$$
\sigma = \sqrt{\frac {\sum_{i=1}^{N}(x_i- \mu)^2}{N}}
$$
**<center>And the $\mu$ is the pop mean, which can be proof by calculate the integral of area</center>**

![normal](sources/normal.png)


#### Standard Normal Distribution

**If a random variable X follows a standard normal distribution, we denote it as**<br>
**<center>X ~ $N(0 , 1)$**</center><br>
$$
\phi(x) = \frac 1 { \sqrt {2 \pi}} e ^ {-{ {\frac 12} x^2}}
$$

**Which means the Mathematical Expectation(mean) of this standard normal distribution($ \mu$) is 0.**<br>
**And the [Standard Deviation](https://en.wikipedia.org/wiki/Standard_deviation)($ \sigma$) is 1.**

![standard_normal_distribution](sources/standard_normal_distribution.png)<br>
**The red curve is the standard normal distribution**


#### Normal Random Variable
**If a random variable X follows a normal distribution, we use the following symbol:**<br>
**<center>X ~ $N( \mu , \sigma ^2)$**</center><br>





















