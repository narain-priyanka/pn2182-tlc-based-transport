package etl

import org.apache.spark.sql.{DataFrame, SparkSession}

object TaxiZones {
  val input_path = "project/data/source/tlc/zones"
  val output_path = "project/data/clean/tlc/zones"

  def clean(df: DataFrame): DataFrame = {
    // TODO: clean df, extract and rename selected columns
    df
  }

  def save(df: DataFrame, path: String): Unit = {
    // TODO: save
  }

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("CleanTaxiZones").getOrCreate()

    val raw_df = spark.read.option("header", true).option("inferSchema", true).csv(input_path)
    val clean_df = clean(raw_df)
    save(clean_df, output_path)
  }
}