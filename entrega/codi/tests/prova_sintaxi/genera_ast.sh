java -jar ../../bin/prova_sintaxi.jar $1 > $1.out
dot -Tps $1.out -o $1.ps
rm $1.out
