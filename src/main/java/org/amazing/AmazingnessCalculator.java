package org.amazing;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class AmazingnessCalculator
{
    private static final Logger LOG = Logger.getLogger(AmazingnessCalculator.class);
    public static List<String> amazingNames = List.of("Tsvetan Tsvetkov",
            "Daniel Rankov", "Alex Alexandrov", "Andrey Balevski", "Danail Denev","Daniel Obretenov", "Dimo Hristov",
            "Emil Doganov", "Emil Petleshkov", "Evgeniy Hristov", "Georgi Vasilev", "Ivan Ivanov", "Kamen Blagoev",
            "Lyubomir Tochev", "Radoslav Topalov", "Stefan Minchev", "Stoyan Stoyanov",
            "Tsvetomira Koleva", "Vasil Beshev", "Dimitar Vasilev", "Yosif Peev", "Yordan Babukov", "Jivko Jelev". "Hristo Nestorov");

    public boolean isPersonAmazing(String name){
        LOG.info( "Somebody is trying to see if person '"+name+"' is amazing..." );
        if(amazingNames.contains( name )) {
            LOG.info( "Well, yes! '"+name+"' is amazing!" );
            return true;
        }
        LOG.info( "Well no... '"+name+"' is not amazing" );
        return false;
    }
}
