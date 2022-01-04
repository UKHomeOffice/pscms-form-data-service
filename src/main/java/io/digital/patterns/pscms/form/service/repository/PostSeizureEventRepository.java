package io.digital.patterns.pscms.form.service.repository;

import io.digital.patterns.pscms.form.service.models.PostSeizureEvent;
import io.digital.patterns.pscms.form.service.models.PostSeizureItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostSeizureEventRepository extends JpaRepository<PostSeizureEvent, String> {
}
