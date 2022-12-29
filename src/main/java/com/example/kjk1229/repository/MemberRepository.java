package com.example.kjk1229.repository;

import com.example.kjk1229.dto.MemberResponseDto;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@NoRepositoryBean
public interface MemberRepository extends JpaRepository<MemberResponseDto, Long> {
    @Override
    List<MemberResponseDto> findAll();

    @Override
    void flush();

    @Override
    <S extends MemberResponseDto> S saveAndFlush(S entity);

    @Override
    <S extends MemberResponseDto> List<S> saveAllAndFlush(Iterable<S> entities);

    @Override
    void deleteAllInBatch(Iterable<MemberResponseDto> entities);

    @Override
    void deleteAllByIdInBatch(Iterable<Long> longs);

    @Override
    void deleteAllInBatch();

    @Override
    MemberResponseDto getOne(Long aLong);

    @Override
    MemberResponseDto getById(Long aLong);

    @Override
    MemberResponseDto getReferenceById(Long aLong);

    @Override
    <S extends MemberResponseDto> List<S> findAll(Example<S> example);

    @Override
    <S extends MemberResponseDto> List<S> findAll(Example<S> example, Sort sort);

    @Override
    <S extends MemberResponseDto> List<S> saveAll(Iterable<S> entities);

    @Override
    List<MemberResponseDto> findAllById(Iterable<Long> longs);

    @Override
    <S extends MemberResponseDto> S save(S entity);

    @Override
    Optional<MemberResponseDto> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(MemberResponseDto entity);

    @Override
    void deleteAllById(Iterable<? extends Long> longs);

    @Override
    void deleteAll(Iterable<? extends MemberResponseDto> entities);

    @Override
    void deleteAll();

    @Override
    List<MemberResponseDto> findAll(Sort sort);

    @Override
    Page<MemberResponseDto> findAll(Pageable pageable);

    @Override
    <S extends MemberResponseDto> Optional<S> findOne(Example<S> example);

    @Override
    <S extends MemberResponseDto> Page<S> findAll(Example<S> example, Pageable pageable);

    @Override
    <S extends MemberResponseDto> long count(Example<S> example);

    @Override
    <S extends MemberResponseDto> boolean exists(Example<S> example);

    @Override
    <S extends MemberResponseDto, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}