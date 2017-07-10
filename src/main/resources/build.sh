#!/bin/bash

#npm install

mkdir -p static/assets/css
cp -a static/src/css/* static/assets/css/

#mkdir -p static/assets/images
#cp -a static/src/images/* static/assets/images/

mkdir -p static/assets/js

#On Dev Build
./node_modules/webpack/bin/webpack.js --devtool source-map