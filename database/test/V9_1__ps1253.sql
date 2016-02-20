SELECT gt.id INTO @alertTypeJournalIdVar
  FROM namedEntities.globalTypes gt
  JOIN namedEntities.typeDescriptions td ON gt.typeid = td.id
 WHERE td.description='Alert Types' AND gt.shortDescription='journal';

SELECT gt.id INTO @alertTypeSearchIdVar
  FROM namedEntities.globalTypes gt
  JOIN namedEntities.typeDescriptions td ON gt.typeid = td.id
 WHERE td.description='Alert Types' AND gt.shortDescription='search';

SELECT gt.id INTO @alertFreqTypeIdVar
  FROM namedEntities.globalTypes gt
  JOIN namedEntities.typeDescriptions td ON gt.typeid = td.id
 WHERE td.description='Alert Frequency' AND gt.shortDescription='weekly';

SELECT gt.id INTO @journalTypeBioIdVar
  FROM namedEntities.globalTypes gt
  JOIN namedEntities.typeDescriptions td ON gt.typeid = td.id
 WHERE td.description='Journal Types' AND gt.shortDescription='PLOS Biology';

SELECT gt.id INTO @journalTypeOneIdVar
  FROM namedEntities.globalTypes gt
  JOIN namedEntities.typeDescriptions td ON gt.typeid = td.id
 WHERE td.description='Journal Types' AND gt.shortDescription='PLOS ONE';

SELECT gt.id INTO @srcTypeIdVar
   FROM namedEntities.globalTypes gt
   JOIN namedEntities.typeDescriptions td ON gt.typeid = td.id
  WHERE td.description='Source Applications' AND gt.shortDescription='Ambra';

SELECT id INTO @consumerIdVar FROM namedEntities.consumers WHERE name = 'test';

-- note: this one will be deleted via migration 10
INSERT INTO namedEntities.alerts(id, nedId, typeId, frequencyTypeId, journalTypeId, name, query, sourceTypeId, createdBy, lastModifiedBy)
    VALUES (1, 1, @alertTypeJournalIdVar, @alertFreqTypeIdVar, @journalTypeBioIdVar, "alert one", "", @srcTypeIdVar, @consumerIdVar, @consumerIdVar);

INSERT INTO namedEntities.alerts(id, nedId, typeId, frequencyTypeId, journalTypeId, name, query, sourceTypeId, createdBy, lastModifiedBy)
    VALUES (2, 1, @alertTypeSearchIdVar, @alertFreqTypeIdVar, @journalTypeBioIdVar, "alert two", "{\"query\":\"goes here\"}", @srcTypeIdVar, @consumerIdVar, @consumerIdVar);

INSERT INTO namedEntities.alerts(id, nedId, typeId, frequencyTypeId, journalTypeId, name, query, sourceTypeId, createdBy, lastModifiedBy)
    VALUES (3, 1, @alertTypeSearchIdVar, @alertFreqTypeIdVar, @journalTypeOneIdVar, "alert three", "{\"query\":\"goes here too\"}", @srcTypeIdVar, @consumerIdVar, @consumerIdVar);