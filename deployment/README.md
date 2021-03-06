Cluster Deployment

To deploy clusters exactly as I've configred them for my demo, use the scripts here to spin up four clusters for the my pipeline. To tweak the amount/type of nodes in clusters, edit the corresponding .yml file. Note that a Spark cluster requires a master node, while Cassandra and Kafka do not. For the convenience, here is one cluster working as master, three clusters working as slaves. All deployment for these clusters will be managed through Pegasus.


Set Up

1. Follow the steps in the Pegasus installation guide to clone the Pegasus repo and install Pegasus on your local machine: https://github.com/InsightDataScience/pegasus

2. To use Pegasus, an AWS account and PEM key are required. For the purposes of this deployment process, your PEM key should be accessible on your machine as ~/.ssh/key-pair.pem. Verify your installation of Pegasus with peg config. If successful, you will see your access key, secret key, region, and SSH user printed to the console. Again, MAKE SRUE YOUR SECURITY GROUP IS NOT INBUND ACCESSIBLE TO ALL AS 0.0.0.0./::0

3. Additionally, the scripts in this directory expect two .txt files in your ~/.ssh/ directory: sg.txt, which is a text file with one line listing your security group (e.g.; sg-XXX), and similarly, subnet.txt, a text file with one line listing your subnet (e.g.; subnet-XXX). If you're not sure what to put in these two files, you can view your security groups with peg aws security-groups, and your subnets with peg aws subnets.

You are now ready to deploy the clusters. The scripts I've included will automatically install all the necessary technologies on the clusters and start the necessary services. Please change your path to master.yml and workers.yml if you have your files stored at other places.
For example, to deploy the clusters: $ ~/drinkstream/deployment/deploy.sh
