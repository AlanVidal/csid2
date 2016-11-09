#!/bin/bash

nombre=0;

for i in $(find . -name \*.java -exec wc -l {} \; | cut -f1  -d\  )
do
nombre=$(( $nombre + $i ))
done

echo $nombre