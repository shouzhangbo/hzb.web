package com.my.test.main;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import com.my.test.main.*;

public class WordCount {
	
	public static void main(String[] args)throws Exception{
		Configuration conf =new Configuration();
//		conf.set("mapred.job.tracker", "192.168.252.128:9001");
//		conf.set("fs.default.name", "hdfs://192.168.252.128:9000");
		String inputPath="";//"hdfs://192.168.252.128:9000/user/xuanxuan/input";	    
	    String outputPath="hdfs://192.168.252.128:9000/user/xuanxuan/output";
//		String[] otherArgs =new GenericOptionsParser(conf, args).getRemainingArgs();
//		System.out.println("Ä£Ê½ÊÇ£º"+conf.get("mapred.job.tracker"));
//		if(otherArgs.length !=2){
//			System.err.println("Usage: wordcount <in> <out>");
//			System.exit(2);
//		}
		System.out.println("1111111111111111111111");
		Job job =new Job(conf,"word count");
		job.setJarByClass(WordCount.class);
		job.setMapperClass(com.my.test.main.TokenizerMapper.class);
		job.setCombinerClass(com.my.test.main.IntSumReducer.class);
		job.setReducerClass(com.my.test.main.IntSumReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		FileInputFormat.addInputPath(job,new Path(args[0]));
		FileOutputFormat.setOutputPath(job,new Path(args[1]));//otherArgs[1]));
		System.exit(job.waitForCompletion(true)?0:1);
	}
}
