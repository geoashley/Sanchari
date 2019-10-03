package com.sanchari.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TripTest {

    @Autowired
    private TestEntityManager tem;

    @Autowired
    private TripRepository tripRepository;

    @Test

    public void testTripEntity(){
        this.tem.persist(new Trip(1L, "NovaScotia"));
        Trip trip = this.tripRepository.findById(1L).get();
        assertThat(trip.getId()).isEqualTo(1L);
        assertThat(trip.getTripName()).isEqualTo("NovaScotia");
    }

}
