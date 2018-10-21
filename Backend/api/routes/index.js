var express = require('express'),
  router = express.Router(),
  // productCtrl = require('../controllers/ProductController');
  // usersProductsCtrl = require('../controllers/usersProductsController');
  EmergencyCtrl = require('../controllers/EmergencyCaseController');

//-------------------------------usersProducts Routes-----------------------------------
router.get('/Emergency/getEmergencyCases', EmergencyCtrl.getEmergencyCases);
router.get('/Emergency/getEmergencyCase/:CaseID', EmergencyCtrl.getEmergencyCase);

router.get(
  '/Emergency/getSpecialCases',
  EmergencyCtrl.getSpecialCases
);




//-------------------------------Product Routes-----------------------------------
// router.get('/product/getProducts', productCtrl.getProducts);

// router.get('/product/getProduct/:productId', productCtrl.getProduct);


// router.get(
//   '/product/getProductsBelowPrice/:price',
//   productCtrl.getProductsBelowPrice
// );


// router.post('/product/createProduct', productCtrl.createProduct);
router.post('/Emergency/createEmergencyCase', EmergencyCtrl.createEmergencyCase);
router.post('/Emergency/busy', EmergencyCtrl.busy);
router.patch('/Emergency/updateEmergencyCase/:CaseID', EmergencyCtrl.updateEmergencyCase);
router.delete('/Emergency/deleteEmergencyCase/:CaseID', EmergencyCtrl.deleteEmergencyCase);

module.exports = router;
