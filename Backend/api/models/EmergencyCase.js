var mongoose = require('mongoose');

var EmergencyCaseSchema = mongoose.Schema({
  name: {
    type: String,
    required: true,
    trim: true,
    lowercase: true
  },
  Description: {
    type: String,
    required: true,
    min: 0
  },
  Numbers: {
    type: [String],
    required: true,
    
  },
  Type: {
    type: String
    
    
  },
  
  Icon: {
    type: String,
    default: ""
    
  },
  createdAt: {
    type: Date,
    default: Date.now
  },
  updatedAt: Date
});

mongoose.model('EmergencyCase', EmergencyCaseSchema);
