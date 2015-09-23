#! /bin/sh

rm site.tgz

lein run
tar cvzf site.tgz -C resources/public --exclude=.git .
scp -P 246 site.tgz tuhlmann@agynamix.de:~/ship

