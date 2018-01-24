while read line
do
    echo $line
    host=`echo $line | cut -d : -f 1`
    port=`echo $line | cut -d : -f 2`

    echo stat | nc $host $port | grep -E  "Node count|Mode|Connections|Zxid"
    echo ""
done < zk_hosts
