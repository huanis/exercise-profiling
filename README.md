```
Name: Anisa Maharani
NPM: 200648310
```
# Performance Test
## GUI Report Screenshot
### Endpoint: all-student-name
#### 1. View Results Tree:
![img.png](img.png)

#### 2. View Results in Table:
![img_1.png](img_1.png)


#### 3. Summary Report:
![img_2.png](img_2.png)

#### 4. Graph Results:
![img_3.png](img_3.png)

### Endpoint: highest-gpa
#### 1. View Results Tree:
![img_4.png](img_4.png)

#### 2. View Results in Table:
![img_5.png](img_5.png)

#### 3. Summary Report:
![img_6.png](img_6.png)

#### 4. Graph Results:
![img_7.png](img_7.png)

## Console Report Screenshot
### Endpoint: all-student-name
#### 1. Command:
```
jmeter -n -t test-plans/adpro/tutorial-5/1/test_plan_2.jmx -l test-plans/adpro/tutorial-5/1/test_result_2.jtl
```
![img_8.png](img_8.png)

#### 2. Result:
![img_9.png](img_9.png)

### Endpoint: highest-gpa
#### 1. Command:
```
jmeter -n -t test-plans/adpro/tutorial-5/1/test_plan_3.jmx -l test-plans/adpro/tutorial-5/1/test_result_3.jtl
```
![img_10.png](img_10.png)

#### 2. Result:
![img_11.png](img_11.png)

# Profiling
## Endpoint: all-student
### Before Optimization
![img_12.png](img_12.png)

### After Optimization
![img_13.png](img_13.png)

### Result
```
Before = 3847
After = 825
((Before-After)/Before)*100% = 78%
```

## Endpoint: all-student-name
### Before Optimization
![img_20.png](img_20.png)

### After Optimization
![img_19.png](img_19.png)

### Result
```
Before = 557
After = 36
((Before-After)/Before)*100% = 93%
```

## Endpoint: highest-gpa
### Before Optimization
![img_17.png](img_17.png)

### After Optimization
![img_18.png](img_18.png)

### Result
```
Before = 96
After = 15
((Before-After)/Before)*100% = 84%
```
