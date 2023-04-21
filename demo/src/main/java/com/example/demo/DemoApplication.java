package com.example.demo;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


public class DemoApplication {

	public static void main(String[] args) throws IOException {
		try {


			SparkSession spark = SparkSession.builder()
					.appName("Simple Application")
					.master("local")
					.config("spark.driver.host", "localhost")
					.getOrCreate();

//		Dataset<Row> df = spark. read()
			Dataset<Row> df = spark.read().csv("C:\\Users\\ASUS\\Desktop\\javaCode\\sparkProject\\demo\\src\\main\\resources\\Sample-Spreadsheet-100-rows.csv");

			df.show();
//			df.write().format("csv").option("header", "true").csv("C:\\Users\\ASUS\\Desktop\\javaCode\\sparkProject\\demo\\src\\main\\resources\\textFile\\abc");


			//===============
			Dataset<Row> df1= spark.read().csv("C:\\Users\\ASUS\\Desktop\\javaCode\\sparkProject\\demo\\src\\main\\resources\\normal.csv");

			df1.createOrReplaceTempView("student2");
//			spark.sql("select* from Student2").show();

			//============
//			df.createOrReplaceTempView("my_table");
//
//
//
////		Dataset<Row> rowNumber= spark.sql("select*, row_number() over(order by storage) as rank from my_table");
////        rowNumber.show();
////	    spark.sql("SELECT * FROM my_table WHERE 0.8==null");
//
//			Dataset<Row> result = spark.sql("SELECT * FROM my_table LIMIT 5 ");
//
//		    show results
//			result.show();
//

			//====================
			df.createOrReplaceTempView("Student1");
//			spark.sql("SELECT * FROM Student").show();


//========================= select  it use show/print specific cilumns

//			Dataset<Row> result1 = df.select("Storage & Organization","35").limit(25);
//			result1.show();
//==========================order by a column it use to show th in order meance increasing oder======
////
//			Dataset<Row> result2 = df.orderBy("Storage & Organization");
//			result2.show();
//			Dataset<Row> result22 = df.orderBy("35");
//			result22.show();


//		=============	// filter rows based on a condition======
//			Dataset<Row> result3 = df.where("38.94 > 100  AND '35'==0.5");
//			result3.show();

//=========================// use boolean operators to combine conditions=========
//
////
//			Dataset<Row> result4 = df.where("'3'<100"); // "3" is is columns name and 100 numeric value for condition
//			result4.show();


//
//			// select top n rows================
//			Dataset<Row> result5 = df.limit(10);
//          result5.show();

//=========================
//			val minVal = df.("SELECT MIN(column_name) FROM my_table").first().getDouble(0)
//          Dataset<Row> result11=df.limit (10 ) ;
//          result11.show();
//		    SELECT MIN(salary), MAX(salary) FROM employees;
//			df.registerTempTable("Student");
//			spark.sql("SELECT * FROM Student").show();
//================== limit use to show the wich are required ===============
//			spark.sql("SELECT *FROM Student").limit(4).show();
//=============== min use to print minimum value in columns=========
//			spark.sql("SELECT MIN(_c6) from Student").show();
//================== Max use to print the max value from that column=======
//			spark.sql("SELECT MAX(_c6) from Student").show();
//=================== trim use for print the that column wich you give in trim bracket======
//			spark.sql("SELECT trim(_c6) from student").show();
//===================round query use to roundfigure in wich first parameter c0ollumns name and scond parameter numbe(ki kitna tak karna hai)
//			spark.sql("SELECT round(_c6,0) from student").show();
//======================== use of like
//			spark.sql("SELECT * from Student WHERE _c2 LIKE 'B%'  ").show();
//			spark.sql("SELECT * from Student WHERE _c2 LIKE '%B'  ").show();
//			spark.sql("SELECT * from Student WHERE _c2 LIKE '%B%'  ").show();
//
//=================
//			spark.sql("select from student as _c2 join student as _c6 on student._c2=student._c6").show();
//=============union========
//			spark.sql("SELECT col1,col2 from Student1 union SELECT col1,col2  from Student2").show();
//			spark.sql("select * from Student1").show();
//			spark.sql("select * from student2").show();


//			SELECT customer_personal_info.NAME AS NAME,transaction_info.TRANSACTION_AMOUNT AS AMOUNT
//			FROM customer_personal_info INNER join transaction_info on customer_personal_info.CUSTOMER_ID = transaction_info.CUSTOMER_ID
//			Where NAME="ANJALI SINHA"

			spark.sql("select Student1._c2  AS _c2 ,student2._c2 AS _c2  from student2 inner join Student1 on Student1._c2=student2 ").show();
//=============================


//			select * from customer_personal_info;
//			select * from transaction_info;
//
//			select CUSTOMER_ID from customer_personal_info
//			Union
//			select CUSTOMER_ID from transaction_info;


//			SELECT customer_personal_info.NAME AS NAME,transaction_info.TRANSACTION_AMOUNT AS AMOUNT
//			FROM customer_personal_info INNER join transaction_info on customer_personal_info.CUSTOMER_ID = transaction_info.CUSTOMER_ID
//			Where NAME="ANJALI SINHA"


//			SELECT customer_personal_info.NAME AS NAME,transaction_info.TRANSACTION_AMOUNT AS AMOUNT
//			FROM customer_personal_info left join transaction_info on customer_personal_info.CUSTOMER_ID = transaction_info.CUSTOMER_ID;
//
//			select SENDER_ACCOUNT_NO,sum(TRANSACTION_AMOUNT) FROM transaction_info
//			where SENDER_ACCOUNT_NO="SBIN002306";
//
//			select SENDER_ACCOUNT_NO, sum(TRANSACTION_AMOUNT),count(SENDER_ACCOUNT_NO) from transaction_info
//			group by SENDER_ACCOUNT_NO
//			having SENDER_ACCOUNT_NO="SBIN002306";
//=========================

















		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

}
//+---+-------------------------------------------------+------------------+----+-------+------+-----+-------+----------------------+----+
//		|  1|Eldon Base for stackable storage shelf, platinum|Muhammed MacIntyre|   3|-213.25| 38.94|   35|Nunavut|Storage & Organization| 0.8|
//		+---+------------------------------------------------+------------------+----+-------+------+-----+-------+----------------------+----+
//		|  2|                            "1.7 Cubic Foot C...|      Barry French| 293| 457.81|208.16|68.02|Nunavut|            Appliances|0.58|
//		|  3|                            Cardinal Slant-D?...|      Barry French| 293|  46.71|  8.69| 2.99|Nunavut|  Binders and Binde...|0.39|
//		|  4|                                            R380|     Clay Rozendal| 483|1198.97|195.99| 3.99|Nunavut|  Telephones and Co...|0.58|
//		|  5|                            Holmes HEPA Air P...|    Carlos Soltero| 515|  30.94| 21.78| 5.94|Nunavut|            Appliances| 0.5|
//		|  6|                            G.E. Longer-Life ...|    Carlos Soltero| 515|   4.43|  6.64| 4.95|Nunavut|    Office Furnishings|0.37|
//		|  7|                            Angle-D Binders w...|      Carl Jackson| 613| -54.04|   7.3| 7.72|Nunavut|  Binders and Binde...|0.38|
//		|  8|                            SAFCO Mobile Desk...|      Carl Jackson| 613| 127.70| 42.76| 6.22|Nunavut|  Storage & Organiz...|null|
//		|  9|                            SAFCO Commercial ...|    Monica Federle| 643|-695.26|138.14|   35|Nunavut|  Storage & Organiz...|null|
//		| 10|                                       Xerox 198|   Dorothy Badders| 678|-226.36|  4.98| 8.33|Nunavut|                 Paper|0.38|
//		| 11|                                      Xerox 1980|   Neola Schneider| 807|-166.85|  4.28| 6.18|Nunavut|                 Paper| 0.4|
//		| 12|                            Advantus Map Penn...|   Neola Schneider| 807| -14.33|  3.95|    2|Nunavut|          Rubber Bands|0.53|
//		| 13|                            Holmes HEPA Air P...|       Carlos Daly| 868| 134.72| 21.78| 5.94|Nunavut|            Appliances| 0.5|
//		| 14|                            DS/HD IBM Formatt...|       Carlos Daly| 868| 114.46| 47.98| 3.61|Nunavut|  Computer Peripherals|0.71|
//		| 15|                            "Wilson Jones 1""...|     Claudia Miner| 933|  -4.72|  5.28| 2.99|Nunavut|  Binders and Binde...|0.37|
//		| 16|                            Ultra Commercial ...|   Neola Schneider| 995| 782.91| 39.89| 3.04|Nunavut|    Office Furnishings|0.53|
//		| 17|                            "#10-4 1/8"" x 9 ...|  Allen Rosenblatt| 998|  93.80| 15.74| 1.39|Nunavut|             Envelopes| 0.4|
//		| 18|                            Hon 4-Shelf Metal...|   Sylvia Foulston|1154| 440.72|100.98|26.22|Nunavut|             Bookcases| 0.6|
//		| 19|                            Lesro Sheffield C...|   Sylvia Foulston|1154|-481.04| 71.37|   69|Nunavut|                Tables|0.68|
//		| 20|                                            g520|       Jim Radford|1344| -11.68| 65.99| 5.26|Nunavut|  Telephones and Co...|0.59|
//		| 21|                                          LX 788|       Jim Radford|1344| 313.58|155.99| 8.99|Nunavut|  Telephones and Co...|0.58|
//		+---+------------------------------------------------+------------------+----+-------+------+-----+-------+----------------------+----+