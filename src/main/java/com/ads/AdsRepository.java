package com.ads;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AdsRepository extends MongoRepository<Ads, Long>{
}
