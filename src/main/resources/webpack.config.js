var path = require('path');

module.exports = {
  entry: './static/src/js/main.js',
  output: {
    filename: 'bundle.js',
    path: path.resolve(__dirname, 'static/assets/js')
  }
};
