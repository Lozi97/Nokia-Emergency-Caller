var mongoose = require('mongoose'),
  moment = require('moment'),
  Validations = require('../utils/Validations'),
  EmergencyCase = mongoose.model('EmergencyCase');

module.exports.getEmergencyCase = function(req, res, next) {
  if (!Validations.isObjectId(req.params.CaseID)) {
    return res.status(422).json({
      err: null,
      msg: 'productId parameter must be a valid ObjectId.',
      data: null
    });
  }
  EmergencyCase.findById(req.params.CaseID).exec(function(err, product) {
    if (err) {
      return next(err);
    }
    if (!product) {
      return res
        .status(404)
        .json({ err: null, msg: 'Product not found.', data: null });
    }
    res.status(200).json({
      err: null,
      msg: 'Product retrieved successfully.',
      data: product
    });
  });
};

module.exports.getEmergencyCases = function(req, res, next) {
    EmergencyCase.find({}).exec(function(err, products) {
    if (err) {
      return next(err);
    }
    res.status(200).json({
      err: null,
      msg: 'Products retrieved successfully.',
      data: products
    });
  });
};

module.exports.getSpecialCases = function(req, res, next) {
    
    EmergencyCase.find({
      Type:  'Special'
      
    }).exec(function(err, products) {
      if (err) {
        return next(err);
      }
      res.status(200).json({
        err: null,
        msg:
          'Products with name ' +
          
          ' retrieved successfully.',
        data: products
      });
    });
  };

module.exports.createEmergencyCase = function(req, res, next) {
  
  // Security Check
  delete req.body.createdAt;
  delete req.body.updatedAt;

  EmergencyCase.create(req.body, function(err, product) {
    if (err) {
      return next(err);
    }
    res.status(201).json({
      err: null,
      msg: 'Product was created successfully.',
      data: product
    });
  });
};

module.exports.updateEmergencyCase = function(req, res, next) {
  if (!Validations.isObjectId(req.params.CaseID)) {
    return res.status(422).json({
      err: null,
      msg: 'productId parameter must be a valid ObjectId.',
      data: null
    });
  }
  
  // Security Check
  delete req.body.createdAt;
  req.body.updatedAt = moment().toDate();

  EmergencyCase.findByIdAndUpdate(
    req.params.CaseID,
    {
      $set: req.body
    },
    { new: true }
  ).exec(function(err, updatedProduct) {
    if (err) {
      return next(err);
    }
    if (!updatedProduct) {
      return res
        .status(404)
        .json({ err: null, msg: 'Product not found.', data: null });
    }
    res.status(200).json({
      err: null,
      msg: 'Product was updated successfully.',
      data: updatedProduct
    });
  });
};

module.exports.deleteEmergencyCase = function(req, res, next) {
  if (!Validations.isObjectId(req.params.CaseID)) {
    return res.status(422).json({
      err: null,
      msg: 'productId parameter must be a valid ObjectId.',
      data: null
    });
  }
  EmergencyCase.findByIdAndRemove(req.params.CaseID).exec(function(
    err,
    deletedProduct
  ) {
    if (err) {
      return next(err);
    }
    if (!deletedProduct) {
      return res
        .status(404)
        .json({ err: null, msg: 'Product not found.', data: null });
    }
    res.status(200).json({
      err: null,
      msg: 'Product was deleted successfully.',
      data: deletedProduct
    });
  });
};



module.exports.busy = function(req, res, next) {
  
    // Security Check
   
  res.send({
        "action": {
          "actionToPerform": "Route",
          "routingAddress": "sip:+358480786520@ims8.wirelessfuture.com",
          
      "displayAddress": "sip:+358480786518@ims8.wirelessfuture.com",
      
        }
      });
  };

  module.exports.NotAnswered = function(req, res, next) {
  
    // Security Check
   
  res.send({
        "action": {
          "actionToPerform": "Route",
          "routingAddress": "sip:+358480786520@ims8.wirelessfuture.com",
          
      "displayAddress": "sip:+358480786518@ims8.wirelessfuture.com",
      
        }
      });
  };
  module.exports.NotReachable = function(req, res, next) {
  
    // Security Check
   
  res.send({
        "action": {
          "actionToPerform": "Route",
          "routingAddress": "sip:+358480786520@ims8.wirelessfuture.com",
          
      "displayAddress": "sip:+358480786518@ims8.wirelessfuture.com",
      
        }
      });
  };
  