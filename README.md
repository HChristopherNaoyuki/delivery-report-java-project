# Delivery Report Program

This Java program generates a three-month delivery report for three different years (2018, 2019, and 2020). Using a two-dimensional array, it displays monthly delivery data and calculates total, maximum, and minimum deliveries across all years. Designed in Allman style for clarity and readability, the program includes detailed comments explaining each part of the code.

## Table of Contents
- [Features](#features)
- [Program Structure](#program-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Example Output](#example-output)
- [Contributing](#contributing)
- [License](#license)

---

## Features
- **Three-Month Delivery Report**: Displays deliveries for January, February, and March across three years.
- **Delivery Statistics**: Calculates total, maximum, and minimum deliveries across all years and months.
- **Readable Formatting**: Output is organized in a tabular format, and the program adheres to Allman style for readability.
- **Clear Code Documentation**: Each section of code is well-commented to explain its purpose.

## Program Structure
The program consists of a single Java file: `DeliveryReport.java`, which includes:
- **Main Class (`DeliveryReport`)**: Executes the program and displays the report and statistics.
- **Helper Methods**: 
  - `calculateTotal` - Computes the total number of deliveries.
  - `findMax` - Identifies the maximum delivery amount.
  - `findMin` - Identifies the minimum delivery amount.

## Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/delivery-report-java-project.git
   cd DeliveryReport
   ```
2. **Compile the Program**:
   Make sure you have Java installed, then compile the Java file:
   ```bash
   javac Solution/DeliveryReport.java
   ```

## Usage
Run the compiled program from the command line:
```bash
java Solution.DeliveryReport
```

## Example Output
```
*************************************************
DELIVERIES REPORT
*************************************************
                   JAN     FEB     MAR
DELIVERIES 2018    128     135     139
DELIVERIES 2019    155     129     175
DELIVERIES 2020    129     130     185

*************************************************
DELIVERIES STATISTICS
*************************************************
Total Deliveries:      1305
Maximum Delivery:      185
Minimum Delivery:      128
*************************************************
```

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add a new feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a Pull Request.

## License
This project is licensed under the MIT License.

---
